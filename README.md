# Testes com JUnit

Junit é uma biblioteca de testes de software para a linguagem de programação Java, que fornece um framework para escrever e executar testes de unidade automatizados. Os testes de unidade são usados para verificar a funcionalidade de partes específicas do código, garantindo que cada parte do código funcione corretamente isoladamente, antes de ser integrada com o resto do sistema.

Ao usar o JUnit, os testes são escritos como métodos de uma classe de teste, que herda da classe "TestCase" ou utiliza as anotações "@Test" e "@Before" para definir os métodos de teste e os métodos de configuração do ambiente de teste, respectivamente. Os testes podem verificar a saída de um método ou função, lançar exceções quando um erro é detectado ou comparar resultados com valores esperados.

Algumas das principais vantagens do uso do JUnit para testes de unidade em Java incluem:

* Facilidade de uso: o JUnit é fácil de aprender e utilizar, o que o torna uma escolha popular entre desenvolvedores Java.
Automatização: o JUnit permite a automatização dos testes de unidade, permitindo que os desenvolvedores executem os testes repetidamente, economizando tempo e garantindo a qualidade do código.

* Agilidade: os testes de unidade com JUnit são rápidos de serem executados, permitindo que os desenvolvedores façam correções rapidamente e iterem sobre o código de forma ágil.

* Cobertura de código: os testes de unidade com JUnit podem cobrir uma grande parte do código do sistema, garantindo que a maioria dos possíveis erros sejam detectados antes da integração com outras partes do sistema.

Em resumo, o JUnit é uma ferramenta valiosa para os desenvolvedores Java que desejam garantir a qualidade do código, aumentar a produtividade e reduzir o tempo de depuração e correção de erros.

# Given: 
Representa o estado inicial ou pré-condição do teste. Esta seção define o contexto em que o teste será executado, configurando os objetos e valores necessários para a execução do teste. É importante que os dados fornecidos neste estágio sejam suficientes e realistas para reproduzir o cenário de teste.

# When: 
Representa a ação ou evento que ocorre no sistema que está sendo testado. Nesta seção, é executado o método ou a função que está sendo testada, com base nas informações fornecidas na seção "Given". Este estágio é o responsável por executar a lógica de negócios do sistema, manipular os dados fornecidos na seção "Given" e produzir os resultados do teste.

# Then: 
Representa o resultado ou o comportamento esperado do teste. Nesta seção, é verificado se o resultado obtido após a execução do método ou da função na seção "When" corresponde ao resultado esperado definido na seção "Then". É neste estágio que são definidas as condições para o sucesso ou falha do teste.

# Em Resumo,
O conceito "given, when, then" ajuda a estruturar os testes de forma clara e organizada, tornando-os mais fáceis de entender e manter. Com JUnit5, é possível utilizar as anotações @BeforeEach e @AfterEach para executar o "given" e o "then" antes e depois de cada teste, respectivamente, e a anotação @Test para definir o "when".
