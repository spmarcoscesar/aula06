package br.com.desafioKotlin

class Aluno (val nomeAluno: String, val sobrenomeAluno, val codigoDeAluno: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Aluno) {
            return codigoDeAluno == other.codigoDeAluno
        }
        return false
    }

    override fun hashCode(): Int {
        var result = nomeAluno.hashCode()
        result = 31 * result + sobrenomeAluno.hashCode()
        result = 31 * result + codigoDeAluno
        return result
    }
}


