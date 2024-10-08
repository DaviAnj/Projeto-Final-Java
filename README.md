# Projeto-Final-Java

Documentação do codigo presente no arquivo Curso.Java

Esse código implementa um sistema básico de gerenciamento de cursos e inscrições de alunos em uma plataforma educacional usando Java, esse código oferece uma estrutura básica para a gestão de cursos e alunos, podendo ser expandido com mais funcionalidades conforme necessário. Vou explicar cada parte do código:

Classe Curso
Essa classe representa um curso na plataforma. Cada curso tem três atributos:"nome": o nome do curso, "descricao": uma descrição do curso e "alunos": uma lista de alunos inscritos no curso.

Metodo Construtor: Curso(String nome, String descricao): Inicializa um curso com o nome e descrição fornecidos, e inicializa a lista de alunos como uma nova ArrayList.

Métodos:"getNome()": Retorna o nome do curso , "getDescricao()": Retorna a descrição do curso, "getAlunos()": Retorna a lista de alunos inscritos no curso, "adicionarAluno(String nomeAluno)": Adiciona um aluno à lista de alunos do curso.

Classe Plataforma: Essa classe gerencia uma lista de cursos e permite que alunos sejam inscritos nesses cursos.

Atributo: "cursos": uma lista de objetos "Curso" que representa os cursos cadastrados na plataforma.

Metodo Construtor: "Plataforma()": Inicializa a lista de cursos como uma nova "ArrayList".

Métodos: "adicionarCurso(Curso curso)": Adiciona um novo curso à lista de cursos e imprime uma mensagem de sucesso, "inscreverAluno(String nomeCurso, String nomeAluno)': Inscreve um aluno em um curso específico, se o curso existir na plataforma. Caso contrário, imprime uma mensagem dizendo que o curso não foi encontrado, "listarAlunosPorCurso(String nomeCurso)": Retorna a lista de alunos inscritos em um curso específico. Se o curso não for encontrado, retorna uma lista vazia e imprime uma mensagem, "listarCursos()": Retorna a lista de todos os cursos cadastrados na plataforma, "encontrarCursoPorNome(String nomeCurso)": Procura um curso pelo nome na lista de cursos. Retorna o curso se encontrado, ou "null" se não encontrar.

Método "main":
Este método é o ponto de entrada da aplicação e realiza as seguintes ações:
1. Cria uma instância da "Plataforma";
2. Cria três cursos: "Java Básico", "Python Avançado" e "Desenvolvimento Web";
3. Adiciona os cursos à plataforma usando o método "adicionarCurso";
4. Inscreve alunos nos cursos usando o método "inscreverAluno";
5. Lista os alunos inscritos nos cursos "Java Básico" e "Desenvolvimento Web" e imprime seus nomes;
6. Lista todos os cursos cadastrados na plataforma e imprime o nome e a descrição de cada curso;

Documentação do codigo presente no arquivo Loja.Java

Esse código em Java representa um sistema simples de gerenciamento de produtos dentro de uma loja. O código é composto por duas classes principais: `Produto` e `Loja`.

Classe "Produto"
A classe "Produto" modela um produto com três atributos: nome: O nome do produto, do tipo "String", categoria: A categoria do produto, do tipo "String", preco: O preço do produto, do tipo "double".

A classe "Produto" possui: Um metodo construtor que recebe o nome, a categoria e o preço como parâmetros e inicializa os atributos da classe, Metodos getters ("getNome()",  "getCategoria()", e "getPreco()") que retornam os valores dos atributos correspondentes, Um metodo "toString" sobrescrito que retorna uma representação textual do objeto "Produto".

Classe "Loja": A classe "Loja" modela uma loja que pode conter vários produtos. Ela tem um atributo: "produtos": Uma lista de produtos "(List<Produto>)", que é inicializada como uma "ArrayList" no construtor da classe.

A classe "Loja" possui: Um metodo construtor que inicializa a lista de produtos, o metodo "adicionarProduto(Produto produto)", que adiciona um produto à lista de produtos, O método "listarProdutos()", que retorna a lista de todos os produtos na loja, o metodo "buscarPorNome(String nome)", que retorna uma lista de produtos cujo nome corresponde ao nome fornecido. A comparação é feita ignorando maiúsculas e minúsculas ("equalsIgnoreCase"), o metodo "buscarPorCategoria(String categoria)", que retorna uma lista de produtos pertencentes à categoria fornecida.

Classe Principal
Na classe "Produto", há um método "main" que:
1. Cria uma instância da "Loja".
2. Cria quatro instâncias de "Produto" com diferentes nomes, categorias e preços.
3. Adiciona esses produtos à loja através do método "adicionarProduto".
4. Realiza duas buscas:
   - Primeiramente, busca produtos com o nome "Notebook" e exibe os resultados.
   - Em seguida, busca produtos na categoria "Eletrônicos" e exibe os resultados.
