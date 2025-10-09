package MaratonandoJava.exercices.classesdosexericicos;

public class Seminario {
    public String titulo;
    public String aluno;
    public String profesor;
    public String local;

    public void imprime() {
        System.out.println("-----------------");
        System.out.println(this.aluno);
        System.out.println(this.titulo);
        System.out.println(this.profesor);
        System.out.println(this.local);
        System.out.println("-----------------");
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    static public class aluno {
        public String nome;
        public String titulo;
        public String local;

        public String getLocal() {
            return local;
         }

         public void setLocal(String local) {
            this.local = local;
        }

        public String getNome() {
            return nome;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public int idade;

        public void imprime() {
            System.out.println("-----------------");
            System.out.println(this.nome);
            System.out.println(this.idade);
            System.out.println(this.titulo);
            System.out.println(this.local);
            System.out.println("-----------------");

        }
    }

    static public class professor {
        public String nome;
        public String titulo;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String local;

        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }

        public String getEspecialidade() {
            return especialidade;
        }

        public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public professor(String nome, String especialidade) {
            this.nome = nome;
            this.especialidade = especialidade;
        }

        public String especialidade;

        public void imprime() {
            System.out.println("-----------------");
            System.out.println(this.nome);
            System.out.println(this.especialidade);
            System.out.println(this.local);
            System.out.println("----------------");
        }
    }

    static public class local {
        public String endereco;
        public String titulo;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public local(String endereco) {
            this.endereco = endereco;
        }
    }

    public static void main(String[] args) {
        Seminario seminario = new Seminario("Seminario de yoshida");
        Seminario seminario2 = new Seminario("Seminario de kakashi");

        aluno aluno1 = new aluno("joao", 12);
        aluno aluno2 = new aluno("maria", 17);
        aluno aluno3 = new aluno("gustavo", 13);

        professor professor1 = new professor("Marcelo", "ciencias");

        local local1 = new local("karakura");
        local local2 = new local("Konoha");

        seminario.setTitulo("ciencias habituais");
        seminario2.setTitulo("Gamificando hobbies");



        aluno1.setTitulo(seminario.titulo);
        aluno2.setTitulo(seminario2.titulo);
        aluno3.setTitulo(seminario.titulo);

        aluno1.setLocal(local1.endereco);
        aluno2.setLocal(local2.endereco);
        aluno3.setLocal(local1.endereco);

        professor1.setTitulo(seminario.titulo);
        professor1.setLocal(seminario2.titulo);


        aluno3.imprime();
        professor1.imprime();

    }
}


