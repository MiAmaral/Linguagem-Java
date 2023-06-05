## ✨ Projeto desenvolvido para estudo do JAVA, promovido pelo programa START da Capgemini e elaborado pela ProWay ✨

---

#### 📝 Java é uma linguagem de programação amplamente utilizada na criação de diversos tipos de programas. Ela é conhecida por sua flexibilidade e capacidade de adaptar-se a diferentes finalidades, desde aplicativos simples em dispositivos móveis até sistemas complexos usados por empresas. Com Java, os desenvolvedores podem escrever código uma vez e executá-lo em diferentes plataformas, o que facilita a sua portabilidade. Além disso, a linguagem oferece recursos avançados de segurança, o que contribui para a confiabilidade dos programas desenvolvidos com ela.

 <img src="https://arquivo.devmedia.com.br/artigos/Allan_Romanato/JavaVirtualMachine/JavaVirtualMachine2.jpg" alt="Modelo de Compilação em JAVA" width="350" height="250">


---

## Sumário

- [JAVA != JavaScript](#java)
- [Interface](#interface)
- [Construtores](#construtores)
- [Enumeradores](#enumeradores)
- [Modificadores de Acesso](#modificadores-de-acesso)
- [Arrays](#arrays)
- [Collections](#collections)
- [Classes Wrappers](#classes-wrappers)
- [Genéricos](#genéricos)
- [Annotations](#annotations)
- [Threads](#threads)
- [ForEach](#foreach)
- [Calendar && SimplesDateFormat](#data)
- [Tratamento de Exceções](#tratamento-excecoes)

---

📍**JAVA != JavaScript** <a name="java"></a>

• Ambiente de execução: Java é executado na Java Virtual Machine (JVM), enquanto JavaScript é executado nos navegadores.

• Propósito: Java é usado para desenvolver diferentes tipos de aplicativos, enquanto JavaScript é usado principalmente para tornar as páginas web mais interativas.

• Compilação vs. Interpretação: Java é compilada antes de ser executada, enquanto JavaScript é interpretada diretamente pelo navegador.

• Exemplos de uso: Java pode ser usado para construir programas complexos, como sistemas bancários, aplicativos móveis e jogos. JavaScript é usado para adicionar funcionalidades dinâmicas a sites, como animações, validações de formulários e interações com o usuário.

---

📍**Interface** <a name="interface"></a>

• Uma interface em Java é uma coleção de métodos abstratos e constantes que podem ser implementados por classes. Ela define um contrato que as classes que a implementam devem seguir. As interfaces fornecem um mecanismo para alcançar a abstração e o polimorfismo em Java.

---

📍**Construtores** <a name="construtores"></a>

• Um construtor é um método especial que é invocado durante a criação de um objeto. Ele é responsável por inicializar os membros da classe e pode ter parâmetros ou não. O construtor tem o mesmo nome da classe em que está definido e é chamado automaticamente quando um objeto é criado usando o operador new. 

---

📍**Enumeradores** <a name="enumeradores"></a>

• Enumeradores são uma maneira de definir um tipo de dados que consiste em um conjunto fixo de valores constantes. Eles são usados para representar um grupo de constantes relacionadas, como os dias da semana ou os meses do ano. Os enumeradores fornecem uma forma mais segura e legível de representar conjuntos de constantes em comparação com o uso de valores literais. 

---

📍**Modificadores de acesso** <a name="modificadores-de-acesso"></a>

• Os modificadores de acesso  são palavras-chave que definem o nível de acesso ou visibilidade de classes, métodos, variáveis e construtores em um programa. Existem quatro tipos de modificadores de acesso: public, private, protected e default (sem modificador). Eles determinam quais partes do código podem acessar e modificar elementos específicos.

---

📍**Arrays** <a name="arrays"></a>

• Vetores:  um vetor é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo. Ele é uma sequência ordenada de elementos, onde cada elemento é identificado por um índice. Os vetores possuem um tamanho fixo, determinado durante a sua criação, e podem ser usados para armazenar e manipular conjuntos de valores.

• Matrizes: Uma matriz é uma estrutura de dados bidimensional que consiste em uma coleção de elementos organizados em linhas e colunas. Ela é uma tabela retangular de valores, onde cada elemento é identificado por um par de índices (linha e coluna). As matrizes são usadas para representar estruturas de dados mais complexas, como tabelas, imagens ou grades.

---

📍**Collections** <a name="collections"></a>

• As coleções são frameworks que fornecem estruturas de dados prontas para uso, permitindo armazenar e manipular conjuntos de objetos de forma eficiente. Elas são usadas para realizar operações comuns, como adicionar, remover, pesquisar e ordenar elementos. As coleções em Java são implementadas por meio de interfaces e classes, como List, Set, Map, entre outras, e oferecem uma ampla gama de funcionalidades para lidar com dados.

---

📍**Classes Wrappers** <a name="classes-wrappers"></a>

• As classes wrappers são classes que fornecem uma representação de objetos para tipos de dados primitivos. Em Java, os tipos primitivos, como int, boolean, double, entre outros, não são considerados objetos e não possuem métodos ou funcionalidades adicionais. 

• Por meio das classes wrappers, é possível tratar esses tipos primitivos como objetos, permitindo o uso de métodos e recursos adicionais.
Existem oito classes wrappers principais em Java, uma para cada tipo primitivo:

• Boolean
• Byte
• Short
• Integer
• Long
• Float
• Double
• Character

• Essas classes wrappers possuem constantes e métodos estáticos úteis para operações comuns, como conversões de tipos, obtenção de valores máximos e mínimos, entre outros. Além disso, são frequentemente usadas em conjunto com coleções e estruturas de dados genéricas, que requerem o uso de objetos em vez de tipos primitivos.

---

📍 **Genéricos** <a name="genéricos"></a>

• Os genéricos permitem a parametrização de tipos em classes, interfaces e métodos.

• Eles oferecem flexibilidade e reutilização de código, permitindo que uma mesma classe possa ser usada com diferentes tipos de dados sem duplicação.

• São definidos usando a sintaxe <T>, onde "T" representa o tipo genérico que pode ser substituído por qualquer tipo válido em tempo de compilação.

• Eles garantem segurança de tipos, evitando erros de cast e tornando o código mais legível.

• Permitem criar estruturas de dados genéricas, como listas, filas e pilhas, capazes de armazenar diferentes tipos de objetos.

• Em resumo, são uma poderosa ferramenta do Java para criar código flexível, reutilizável e seguro em relação aos tipos de dados utilizados.

---

📍 **Annotations**<a name="annotations"></a>

• As annotations, ou anotações, são metadados que podem ser adicionados aos elementos do código em Java.

• Elas são representadas por "@" seguido do nome da annotation e fornecem informações extras ao compilador e outras ferramentas.

• As annotations podem ser usadas para diversos fins, como validação, geração de código automático e configuração de frameworks.

• Elas podem ser pré-definidas em Java, como @Override, ou personalizadas pelo desenvolvedor.

• As annotations podem ser processadas em tempo de compilação ou em tempo de execução, dependendo do caso.

---

📍 **Threads** <a name="threads"></a>

• Threads em Java são unidades de execução concorrentes que permitem a execução simultânea de diferentes partes do código.

• Elas são úteis para executar tarefas independentes em paralelo, melhorando o desempenho e a responsividade do programa.Em Java, as threads podem ser criadas estendendo a classe Thread ou implementando a interface Runnable.

• A decisão sobre como lidar com as threads em um servidor é responsabilidade do próprio servidor. O servidor pode implementar diferentes estratégias de gerenciamento de threads, dependendo das necessidades e das características específicas da aplicação.

---

📍 **ForEach** <a name="foreach"></a>

• O foreach é uma estrutura de controle em Java que permite percorrer elementos de uma coleção (como arrays, listas, conjuntos, etc.) de forma simplificada.

• É uma alternativa ao loop tradicional for, sendo mais legível e menos suscetível a erros.

• A cada iteração, a variável de iteração assume o valor de cada elemento da coleção, permitindo que você execute uma ação específica para cada elemento.

• O foreach percorre os elementos da coleção de forma sequencial, garantindo a ordem em que os elementos são processados.

• O foreach é especialmente útil quando você deseja percorrer todos os elementos de uma coleção sem a necessidade de acessar os índices individualmente.

• No entanto, é importante observar que o foreach não é apropriado quando você precisa acessar o índice dos elementos ou quando é necessário realizar iterações com um controle mais refinado.

---

📍 **Calendar && SimplesDateFormat** <a name="data"></a>

>*Calendar*:

• O Calendar é uma classe que permite manipular datas, horas e campos de data. Ele fornece métodos para trabalhar com componentes individuais de data e hora.

• É possível realizar cálculos de adição ou subtração de dias, semanas, meses ou anos.

• É uma classe abstrata e serve como uma abstração para representar datas e realizar operações de calendário.

>*SimpleDateFormat*:

• O SimpleDateFormat é uma classe usada para formatar e analisar datas em formato de texto.

• Ele permite converter uma representação textual de uma data em um objeto Date ou vice-versa. É possível definir um padrão de formatação de data personalizado.

Embora tenham propósitos diferentes, o Calendar e o SimpleDateFormat são frequentemente usados juntos para operações com datas, como obter uma data formatada a partir de um objeto Calendar usando um SimpleDateFormat.

---

📍 **Tratamento de Exceções** <a name="tratamento-excecoes"></a>

• O uso de throw, throws, try e catch está relacionado ao tratamento de exceções, que são eventos que podem ocorrer durante a execução de um programa e que podem interromper o fluxo normal de execução. Vamos entender como cada um desses elementos é usado:

• Geralmente, você usará try-catch quando souber que um determinado bloco de código pode lançar uma exceção específica e desejar fornecer um tratamento adequado para lidar com essa exceção. 

• O throw é usado quando quiser lançar uma exceção manualmente para indicar um problema específico em seu código. 

• O throws é usado na declaração de método para indicar que o método pode lançar exceções verificadas e que elas devem ser tratadas por quem chama o método.


😝
