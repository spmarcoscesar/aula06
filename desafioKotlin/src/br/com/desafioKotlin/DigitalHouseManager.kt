package br.com.desafioKotlin

class DigitalHouseManager {
    private val alunos = mutableListOf<Aluno>()
    private val professores = mutableListOf<Professor>()
    private val cursos = mutableListOf<Curso>()
    private val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nomeCurso: String, codigoCurso: Int, qtdMaxAlunos: Int) {
        val curso = Curso(nomeCurso, codigoCurso, qtdMaxAlunos)
    }

    fun excluirCurso(codigoCurso: Int) {
        for (curso in cursos) {
            if (curso.codigoCurso == codigoCurso)
                cursos.remove(curso)
        }
    }

    fun registrarProfessorAdjunto(
        nomeProfessor: String,
        sobrenomeProfessor: String,
        codigoProfessor: Int,
        qtdDeHoras: Int
    ) {
        val professorAdjunto = ProfessorAdjunto(nomeProfessor, sobrenomeProfessor, 0, codigoProfessor, qtdDeHoras)
        val add = professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(
        nome: String, sobrenome: String,
        codigoProfessor: Int, tempoDeCasa: Int, especialidade: String
    ) {
        val professorTitular = ProfessorTitular(nome, sobrenome, tempoDeCasa, codigoProfessor, especialidade)
        professores.add(professorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (prof in professores) if (prof.codigoProfessor == codigoProfessor) {
            professores.remove(prof)
        }
    }

    fun matricularAluno(codigoDeAluno: Int, codigoCurso: Int) {
        var alunoEncontrado: Aluno? = null
        var cursoEncontrado: Curso? = null
        for (aluno in alunos) {
            if (aluno.codigoDeAluno == codigoDeAluno)
            val also = aluno.also { alunoEncontrado = it }
        }
        for (curso in cursos) {
            if (curso.codigoCurso == codigoCurso) cursoEncontrado = curso
        }
        if (alunoEncontrado != null && cursoEncontrado != null) {
            val realizadoComSucesso = cursoEncontrado.adicionarUmAluno(alunoEncontrado)
            if (realizadoComSucesso) {
                val matricula = Matricula(alunoEncontrado, cursoEncontrado)
                matriculas.add(matricula)
            } else {
                println("Infelizmente não há mais vagas disponíveis neste curso.")
            }
        }
        fun criarAluno(
            nome: String, sobrenome: String, codigoAluno:
            Int
        ) {
            val aluno = Aluno(nome, sobrenome, codigoAluno)
            alunos.add(aluno)
        }
    }


    }