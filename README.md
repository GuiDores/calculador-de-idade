# calculador-de-idade
🚀 Calculador de Idade Precisa em Java
Este é um pequeno projeto em Java que demonstra como calcular a idade de uma pessoa de forma precisa, levando em consideração o dia e o mês do seu aniversário. Ele coleta o nome, dia, mês e ano de nascimento do usuário e, em seguida, utiliza a API java.time para determinar a idade exata.

✨ Funcionalidades
Coleta o nome completo, dia, mês e ano de nascimento do usuário.

Calcula a idade da pessoa com precisão, considerando se o aniversário já ocorreu no ano corrente.

Utiliza a moderna API java.time do Java para manipulação de datas.

Exibe uma mensagem personalizada com o nome e a idade calculada.

🛠️ Tecnologias Utilizadas
Java: Linguagem de programação principal.

Java Development Kit (JDK) 8 ou superior: Necessário para compilar e executar o código, devido ao uso da API java.time.LocalDate.

🚀 Como Executar
Para rodar este projeto na sua máquina:

Clone o repositório (se estiver no GitHub/GitLab) ou salve o arquivo App.java em uma pasta.

Certifique-se de ter um JDK (Java Development Kit) instalado (versão 8 ou superior). Você pode baixá-lo do Eclipse Adoptium.

Abra o terminal ou prompt de comando na pasta onde o arquivo App.java está salvo.

Compile o código usando o comando:

Bash

javac App.java
Execute o programa com o comando:

Bash

java App
Siga as instruções no console para inserir seus dados.

💡 Como Funciona o Cálculo Preciso?
O programa utiliza a classe LocalDate da API java.time.

Ele obtém a data atual (LocalDate.now()).

Cria um objeto LocalDate para a data de nascimento fornecida pelo usuário.

A idade é calculada inicialmente pela diferença dos anos (anoAtual - anoNascimento).

Para a precisão, ele compara o dia do ano (getDayOfYear()) da data atual com o dia do ano da data de nascimento. Se o dia do ano atual for menor que o dia do ano do aniversário, significa que o aniversário ainda não ocorreu no ano corrente, e a idade é ajustada em -1.

🤝 Contribuições
Sinta-se à vontade para sugerir melhorias ou novas funcionalidades.
