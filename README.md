# logic_challenge_supera
Aqui está um exemplo de README para o seu projeto de código de cores de resistores:

---

## Resistor Color Code Calculator

### Descrição

Este projeto Java é uma aplicação de console que calcula o código de cores de um resistor com base no valor de resistência fornecido pelo usuário. Ele suporta valores de resistência em ohms, quilohms (k), e megohms (M), e gera o código de cores correspondente para resistores de 4 bandas.

### Estrutura do Projeto

O projeto é organizado nas seguintes pastas:

- **com.sw_software.resistors.app**: Contém a classe principal `ColorCodeResistor` que executa a aplicação de console.
- **com.sw_software.resistors.factory**: Contém a classe `ResistorFactory` responsável por criar instâncias de resistores.
- **com.sw_software.resistors.model**: Contém as interfaces e classes relacionadas ao modelo de dados, como `CodeColor`, `CodeColorImpl`, e `Resistor`.

### Como Funciona

1. **Entrada do Usuário**: O usuário é solicitado a inserir o valor de resistência (por exemplo, "220 ohms", "4.7k ohms", ou "1M ohms").
2. **Conversão de Valor**: O valor de resistência é convertido para um número inteiro de ohms.
3. **Geração do Código de Cores**: O código de cores correspondente ao valor do resistor é gerado usando a implementação de `CodeColor`.
4. **Exibição do Resultado**: O código de cores é exibido no console.

### Exemplo de Uso

```shell
Digite o valor da resistência:  
220 ohms
Código de cores: vermelho vermelho marrom dourado

Digite o valor da resistência:  
4.7k ohms
Código de cores: amarelo violeta vermelho dourado
```

### Classes Principais

- **ColorCodeResistor**: Classe principal que executa a aplicação de console.
- **ResistorFactory**: Classe responsável por criar objetos `Resistor`.
- **CodeColor**: Interface para definir a conversão de valores em códigos de cores.
- **CodeColorImpl**: Implementação da interface `CodeColor` que gera o código de cores.
- **Resistor**: Classe que representa um resistor e armazena seu valor e código de cores.

### Requisitos

- Java 8 ou superior

### Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/usuario/resistor-color-code.git
   ```
2. Compile o código:
   ```bash
   javac -d out src/com/sw_software/resistors/app/ColorCodeResistor.java
   ```
3. Execute o programa:
   ```bash
   java -cp out com.sw_software.resistors.app.ColorCodeResistor
   ```

### Melhorias Futuras

- Suporte para resistores de 5 e 6 bandas.
- Interface gráfica para facilitar a interação do usuário.
- Suporte para tolerâncias personalizadas.


---------------------------------------------------------------------------------------------------------------------------------------------------------------

---

## Snail Matrix

Este projeto Java implementa um algoritmo que percorre os elementos de uma matriz em um padrão de caracol (espiral), de fora para dentro. A solução foi desenvolvida utilizando um design orientado a estratégia, permitindo a fácil substituição de diferentes estratégias de ordenação.

### Índice

- [Visão Geral](#visão-geral)
- [Arquitetura](#arquitetura)
- [Como Usar](#como-usar)
- [Exemplos](#exemplos)
- [Requisitos](#requisitos)
- [Testes](#testes)
- [Contribuições](#contribuições)
- [Licença](#licença)

### Visão Geral

O projeto Snail Matrix é uma solução para o problema de percorrer os elementos de uma matriz bidimensional em um padrão de caracol, iniciando do canto superior esquerdo e seguindo em espiral até o centro.

### Arquitetura

A aplicação é composta por várias classes organizadas conforme o padrão Strategy, facilitando a implementação e extensão de diferentes métodos de ordenação de matrizes.

- **Matrix**: Representa a matriz bidimensional.
- **SnailOrder**: Interface que define o método `getSnailOrder(Matrix matrix)` para retornar a ordem dos elementos.
- **SnailOrderImpl**: Classe abstrata que fornece a implementação base para o padrão de caracol.
- **DefaultSnailOrder**: Implementação concreta que define o padrão de caracol básico, processando as linhas e colunas em sequência.
- **SnailOutToInnerService**: Serviço que utiliza uma estratégia definida pela interface `SnailOrder` para calcular a ordem dos elementos da matriz.

### Como Usar

#### Instalação

Clone o repositório e importe o projeto em sua IDE Java de preferência.

```bash
git clone https://github.com/SWillames/snail_matrix.git
```

#### Execução

A classe principal `Snail` contém exemplos de como utilizar o serviço para obter a ordem dos elementos em uma matriz.

```java
public class Snail {
  public static void main(String[] args) {
    int[][] example1 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    Matrix matrix1 = new Matrix(example1);

    SnailOutToInnerService service = new SnailOutToInnerService(new DefaultSnailOrder());

    System.out.println(service.getSpiralOrder(matrix1)); // Saída: [1, 2, 3, 6, 9, 8, 7, 4, 5]
  }
}
```

### Exemplos

#### Exemplo 1

Entrada:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Saída: `[1, 2, 3, 6, 9, 8, 7, 4, 5]`

#### Exemplo 2

Entrada:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 10, 12},
    {6, 7, 33}
};
```

Saída: `[1, 2, 3, 12, 33, 7, 6, 4, 10]`

### Requisitos

- Java 8 ou superior
- IDE de sua preferência

### Testes

Para executar os testes, certifique-se de que as dependências estejam configuradas corretamente em seu ambiente. As classes de teste devem cobrir os principais cenários de uso da aplicação.

### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias, correções de bugs ou novas funcionalidades.

### Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
