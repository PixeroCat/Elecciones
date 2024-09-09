fun main() {

    val representante = Representante(0,0, "",0)
    val votacion: MutableList<Representante> = mutableListOf()

    val medioMap = mapOf(
        1 to "Internet",
        2 to "Radio",
        3 to "Television"
    )



        while (true) {
            try {
            println(
                """¿Que desea realizar?
        |1- Votar
        |2- Mostrar campañas
        |3- Borrar urnas
        |4- Costo promedio
        |5- Salir
    """.trimMargin()
            )
            val opcion = readln().toInt()

            when (opcion) {

                1 -> {

                    println(
                        """¿Por cual candidato va a votar?
        |1- Candidato 1
        |2- Candidato 2
        |3- Candidato 3
    """.trimMargin()
                    )
                    val candidato = readln().toInt()
                    println(
                        """¿Por cual medio se enteró de la campaña?
                |1- Internet
                |2- Radio
                |3- Television
            """.trimMargin()
                    )
                    val medio = readln().toInt()
                    val tMed = medioMap[medio]
                    var costoCamp = 0
                    representante.registrarVoto(candidato, tMed, costoCamp)

                }

                2 -> representante.mostrarInfo()

                3 -> representante.borrarUrna()

                4 -> representante.costoPromedio()

                5 -> break

            }
        }catch (e: NumberFormatException){

            println("Dato invalido")
        }
        }

}