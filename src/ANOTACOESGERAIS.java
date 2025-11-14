public @interface ANOTACOESGERAIS {
    /*
    *  ==================== SOBRE O STATIC E BLOCO DE INICIALIZACAO ======================
    * 0 - Bloco de iniciializacao estatico(STATIC) da super classe é executado quando
          a jvm carregar a classe pai.
    * 1 - Bloco de iniciializacao estatico(STATIC) da subclasse é executado quando
          a jvm carregar a classe filha.
    * 2 - Alocado espaco em memoria pro objeto da classe superclase.
    * 3 - Cada um dos atributos de classe é criado e inicializado com valores
          default(padroes) ou oque for passado.
    * 4 - Bloco de inicializacao(BI) da superclasse é executado na ordem em que aparece.
    * 5 - Construtor é executado da superclasse.
    * 6 - Alocado espaco em memoria pro objeto da classe subclasse.
    * 7 - Cada um dos atributos de subclasse é criado e inicializado com valores
          default(padroes) ou oque for passado.
    * 8 - Bloco de inicializacao(BI) da superclasse é executado na ordem em que aparece.
    * 9 - Construtor é executado da sub/classe.
    */

    /*
    *  ==================== SOBRE AS VARIAVEIS DO TIPO REFERENCIA E FINAL ======================
     *  variaveis do tipo referencia quando sao final nao pode
        alterar a referencia pro objeto. é util pra quando nao
        se quer ficar criando objetos. singleton pattern.
     * metodos que contem final em sua sintaxe nao podem ser sobrescrevidos/
     * classes que contem final nao podem ser herdadas.
     */
    /*

     *  ==================== SOBRE STRINGS E ENUM ======================
     *  Pra comparar strings é necessario usar o .equals logo apos a variavel
     *  se eu usar o enum e sobescrever um metodo eu obirgatoriamente tenho q ter um metodo
        abstrato, esse metodo abstrato nao pode ter nada no corpo, ele so serve como base
        pros metodos anteriores. para exemplo consultar: MaratonandoJava.javacore.Kenum.dominio.TipoPagamento;

     */
    /*
     *  ==================== SOBRE ABSTRACT ======================
     * abstract eh a mesma coisa que concreto.
     * abstract n pode ser misturado com final, final n pode ser extendido(herdad0, ja o abstract pode.
     * serve mto pra obrigar alguma classe a usar algum metodo obrigatorio.
     * metodos abstratos so pode existir em CLASSES abstratas.
     * uma classe abstrata pode ter metodos concretos tanto como abstratos.
     * nao pode ter m ultipla heranca com classe abstrata com java, mas pode ter uma hierarquia maior.
     *
     */

    /*
     *  ==================== SOBRE INTERFACES ======================
     * elas por padrao ja sao publicas e abstratas
     * quando trabalaha com interface nao usa mais extends e sim implements
     * nao pode instanciar um objeto atraves da interface.
     * por padrao todos atributos sao constanstes(final)

     */

    /*
     *  ==================== SOBRE MODIFICADORES DE ACESSO ======================
     * private o mais restritivo
     * default o modificador de acesso quando n ao declarado, chamado tambem
       de mmodificador de acesso de pacote
     * os modificadores de acesso nunca podem ser difretenes do da classe
     * private → só a própria classe consegue acessar. Nem mesmo classes do mesmo pacote conseguem acessar
     * diretamente. Precisa de getter/setter.
     * protected → classes do mesmo pacote ou subclasses (mesmo de outro pacote) conseguem acessar diretamente.
     * default (sem modificador) → só funciona dentro do mesmo pacote.
     * public → qualquer classe, de qualquer pacote, consegue acessar diretamente.
     */

    /*
     *  ==================== SLA ======================
     * se nao estiver acessando nenhum atributo de classe da pra tranformar
       os metodos em static.
       * quando transforma o metodo em static ai n precisa instanciar esse metodo
       *

     */

    /*
     * ======================= CAST ===========================
     * Widening cast → bola pequena na caixinha grande ✅ (Java faz sozinho).
     * Narrowing cast → bola grande na caixinha pequena ⚠️ (tem que avisar com (tipo) porque pode não caber).
     * instanceof verifica se a variável realmente é uma instância de uma
       determinada classe (ou de uma classe que herda dela)."
     */

    /*
     * ======================= EXCECOES ===========================
     * Errors é quando n tem mais oq fazer, a jvm vai parar o comando e o usuario ou desenvolvedor vai
       ter que consertar. um exemplo é o stack overflow, qnd a memoria acaba por estar chamandoi infinitamente
       algum metodo.
     * Checked = sao filhas da classe exception diretamente e se n tratadas irao lancar um erro em tempo de
       compilacao, n dando nem tempo de compilar o codigo. é obrigatorio ter q fazer o tratamento delas.
     * Unchecked = sao filhas ou a propria RuntimeException e nao é obvrigatorio tratar elas
     * Se tiver throws na assinatura do metodo é tipo como se fosse "existe a possibilidade de lancar esse tal erro"
     assinatura do metodo é o private static int divisao blablala
     * se o metodo q sla cria um arquivo for publico, faz sentido deixar pra tratar a excecao quando
       o codigo q chamar o metodo criar aquivo, doque tratar direto no metodo. o oposto acontece quando o
       metodo é privado.
     *  throw new RuntimeException("mensagem"); se usar esse esse codigo, ai fica preferencial
         para qm esta chamando o metodo a criar um trycatch
     * finally sempre vai ser executado independentemente se o catch for ou nao ativado
     * sempre tentar tratar o erro com a devida excecao, e colocar sempre a generica por ultimo
     * try with resources retira mto codigo, conferir o test do Oexception, to com preguica de anotar aq
     * Unchecekd (RuntimeException e suas subclasses) = erro no código (você deu mole, foi garoto, garoteou, brincou em serviço)
      Checked = (Exception, IOException e suas subclasses) = erro fora do código (parabéns).  Exemplo: FileNotFoundException (
      O arquivo que você pediu não existe no disco).
     */

    /*
     *  ======================= WRAPPERS ===========================
     * auto boxing eh quando eu escrevo o wrapper e dps eu venho com o
        tipo primitivo. ex: Integer intW = 1;
     * unboxing eh quando eu uso primeiro o tipo primitivo pra transformar em wrapper.
        ex: int i = IntW;
     */
    /*
     *  ======================= STRINGS ===========================
     * Strings sao imutaveis.
     */

}

