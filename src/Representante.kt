class Representante(var votos:Int, var candidato:Int, var medio: String?, var costoCampana:Int) {
    val votacion: MutableList<Representante> = mutableListOf()

    fun registrarVoto(candidato: Int, tipoMedio:String?, costoCamp:Int){

        val voto = 0
        val costo = when(tipoMedio){

            "Internet" -> costoCamp + 700000
            "Radio" -> costoCamp + 200000
            "Television" -> costoCamp + 600000
            else -> 0
        }
        votos += voto
        costoCampana += costo
        votacion.add(Representante(voto, candidato, tipoMedio, costo))


    }

    fun borrarUrna(){
        votos = 0
        costoCampana = 0
        votacion.clear()
        println("Urnas vacias")
    }

    fun mostrarInfo(){

      println("""Candidato    |   Votos   |   Costo campaña
          | ----------------------------------------------------
      """.trimMargin())
        votacion.groupBy { it.candidato }.forEach { (candidato, votos) ->
            val totalVotos = votos.size
            val totalCosto = votos.sumOf { it.costoCampana }
            println("Candidato $candidato     |   $totalVotos     |   $$totalCosto")

        }

    }

    fun costoPromedio(){

        println("""Candidato    |   Costo promedio de la campaña
          | ----------------------------------------------------
      """.trimMargin())
        votacion.groupBy { it.candidato }.forEach { (candidato, votos) ->
            val totalVotos = votos.size
            val totalCosto = votos.sumOf { it.costoCampana }
            val promCosto = totalCosto / totalVotos
            println("Candidato $candidato     | $$promCosto")

        }

    }
}