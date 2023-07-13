# Modulo8
Exercícios - Classe Abstrata
Este repositório contém a solução para os exercícios que envolvem a implementação de classes abstratas.

Exercício 1 - Loja de Livros, CDs e DVDs
Neste exercício, foi criada uma hierarquia de classes para uma loja que vende livros, CDs e DVDs. Cada produto tem um nome, preço e atributos específicos:

Livros possuem também o atributo autor;
CDs possuem o número de faixas;
DVDs possuem a duração.
Foi sobrescrito o método mostrarDetalhesDoItem em cada classe para imprimir os detalhes específicos de cada tipo de produto.

Na classe Loja, no método main(), foram adicionados 5 produtos diferentes a um vetor e, em seguida, o conteúdo do vetor foi impresso.

Exercício 2 - Classe Abstrata para Formas Geométricas
Neste exercício, foi implementada uma classe abstrata chamada Forma que possui dois métodos abstratos: calcularArea() e calcularPerimetro().

Foram criadas as subclasses Rectangulo, Circulo e Quadrado que herdam da classe Forma e implementam os métodos herdados, juntamente com outros métodos necessários.

Foi elaborado um programa de teste onde é declarado um array de dimensão 5 contendo instâncias de Rectangulo, Circulo e Quadrado seguindo uma ordem aleatória. Em seguida, foi implementado um ciclo que percorre o array e invoca os métodos calcularArea() e calcularPerimetro() para cada objeto armazenado.
