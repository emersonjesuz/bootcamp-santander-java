# CRUD Example with JUnit and Mockito Tests

Este projeto demonstra a criação de um CRUD simples em Java e a escrita de testes unitários usando JUnit e Mockito.

## Configuração do Projeto

### pom.xml

Certifique-se de incluir as dependências do JUnit e Mockito no seu arquivo `pom.xml`:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>crud-example</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>4.0.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
Implementação do CRUD
UserService.java
java
Copiar código
package com.example.crud;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name, String email) {
        User user = new User(name, email);
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, String name, String email) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setName(name);
            user.setEmail(email);
            return userRepository.save(user);
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
UserRepository.java
Vamos criar uma interface de repositório que será simulada nos testes.

java
Copiar código
package com.example.crud;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    boolean existsById(Long id);
    void deleteById(Long id);
}
User.java
java
Copiar código
package com.example.crud;

public class User {
    private Long id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
Testes Unitários com JUnit e Mockito
UserServiceTest.java
java
Copiar código
package com.example.crud;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateUser() {
        User user = new User("John Doe", "john.doe@example.com");
        when(userRepository.save(any(User.class))).thenAnswer(i -> {
            User u = i.getArgument(0);
            u.setId(1L);
            return u;
        });

        User createdUser = userService.createUser("John Doe", "john.doe@example.com");

        assertNotNull(createdUser);
        assertEquals(Long.valueOf(1L), createdUser.getId());
        assertEquals("John Doe", createdUser.getName());
        assertEquals("john.doe@example.com", createdUser.getEmail());
    }

    @Test
    public void testGetUser() {
        User user = new User("Jane Doe", "jane.doe@example.com");
        user.setId(1L);
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        Optional<User> fetchedUser = userService.getUser(1L);

        assertTrue(fetchedUser.isPresent());
        assertEquals("Jane Doe", fetchedUser.get().getName());
        assertEquals("jane.doe@example.com", fetchedUser.get().getEmail());
    }

    @Test
    public void testUpdateUser() {
        User user = new User("John Smith", "john.smith@example.com");
        user.setId(1L);
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        when(userRepository.save(any(User.class))).thenReturn(user);

        User updatedUser = userService.updateUser(1L, "John Updated", "john.updated@example.com");

        assertNotNull(updatedUser);
        assertEquals("John Updated", updatedUser.getName());
        assertEquals("john.updated@example.com", updatedUser.getEmail());
    }

    @Test
    public void testDeleteUser() {
        when(userRepository.existsById(1L)).thenReturn(true);
        doNothing().when(userRepository).deleteById(1L);

        boolean deleted = userService.deleteUser(1L);

        assertTrue(deleted);
        verify(userRepository, times(1)).deleteById(1L);
    }
}

```

Explicação dos Métodos e Funcionalidades

- @Mock
  Funcionalidade: Cria um mock (simulação) de uma classe ou interface.
  Explicação: No nosso exemplo, @Mock é usado para criar uma simulação do UserRepository, que será injetada no UserService.
- @InjectMocks
  Funcionalidade: Cria uma instância da classe e injeta os mocks criados com @Mock ou @Spy nessa instância.
  Explicação: @InjectMocks é usado para criar a instância userService e injetar o mock userRepository nela.
- MockitoAnnotations.initMocks(this)
  Funcionalidade: Inicializa os mocks e injeções anotados com @Mock e @InjectMocks.
  Explicação: O método setUp() inicializa os mocks antes de cada teste.
- when(...).thenReturn(...)
  Funcionalidade: Configura o comportamento do mock. Quando o método especificado é chamado, retorna o valor especificado.
  Explicação: Utilizado para configurar o comportamento do userRepository simulado, por exemplo, para retornar um usuário específico quando findById é chamado.
- verify(...)
  Funcionalidade: Verifica se um método específico foi chamado em um mock.
  Explicação: Utilizado para garantir que deleteById foi chamado uma vez durante o teste de exclusão de usuário.
- doNothing().when(...)
  Funcionalidade: Configura o comportamento de um método void em um mock.
  Explicação: Utilizado para configurar deleteById para não fazer nada quando chamado no teste de exclusão de usuário.
- any(...)
  Funcionalidade: Um matcher que verifica se qualquer valor (do tipo especificado) foi passado como argumento para o método mock.
  Explicação: Utilizado para verificar qualquer instância de User ao salvar o usuário.

Conclusão

Com este exemplo, você tem uma compreensão básica de como criar um CRUD simples e testar suas funcionalidades usando JUnit e Mockito. Os métodos de teste verificam se as operações de criação, leitura, atualização e exclusão estão funcionando corretamente, simulando o comportamento do repositório com Mockito. Cada método de teste usa asserções para garantir que os resultados são os esperados, permitindo que você identifique rapidamente quaisquer problemas no seu código.

Espero que isso ajude a entender o uso de Mockito em testes unitários! Se você tiver mais perguntas ou precisar de mais detalhes, sinta-se à vontade para perguntar.

csharp
Copiar código

Este arquivo README.md inclui todos os exemplos de código e explicações detalhadas sobre as funcionalidades do Mockito e como ele é usado em testes unitários.

![alt text](image.png)
