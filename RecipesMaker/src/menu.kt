import java.awt.datatransfer.StringSelection

fun main(args: Array<String>) {
    var recetas: String = ""
    val ingredientes = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    do{
        menu();
        val response : String? = readLine()
        when(response) {
            "1" -> {
                println("Hacer una receta.")
                recetas += hacerReceta(ingredientes)
            }
            "2" -> {
                println("Mis recetas:")
                verRecetas(recetas)
            }
            "3" -> println("Hasta luego.")
            else -> println("Esa opción es incorrecta.")
        }
    } while (response.equals("3").not())

}

fun menu() {

    val allMenu = """
    :: Bienvenido a Recipe Maker ::  by aaronyamil
    
    Selecciona la opción deseada:
        1. Hacer una receta.
        2. Ver mis recetas.
        3. Salir
    """

    print(allMenu)
}

fun verRecetas(recetas: String) {
    print(recetas);
}

fun hacerReceta(ingredientes: List<String>): String {
    var receta: String
    var listaIngredientes: String = ""
    var title = """
    :: Pon un nombre a tu receta ::
    """
    print(title)
    val respuesta : String? = readLine()

    do{
        title = """
    :: Escoge los ingredientes ::
    """.trimMargin()
        print(title)
        for((index,ingrediente) in ingredientes.withIndex()){
            println("$index :$ingrediente")
        }
        println("8 :Terminar.")
        val response : String? = readLine()
        when(response) {
            "0" -> {
                println("Seleccionado: Agua")
                listaIngredientes += "Agua \n"
            }
            "1" -> {
                println("Seleccionado: Leche")
                listaIngredientes += "Leche \n"
            }
            "2" -> {
                println("Seleccionado: Carne")
                listaIngredientes += "Carne \n"
            }
            "3" -> {
                println("Seleccionado: Verduras")
                listaIngredientes += "Verduras \n"
            }
            "4" -> {
                println("Seleccionado: Frutas")
                listaIngredientes += "Frutas \n"
            }
            "5" -> {
                println("Seleccionado: Cereal")
                listaIngredientes += "Cereal \n"
            }
            "6" -> {
                println("Seleccionado: Huevos")
                listaIngredientes += "Huevos \n"
            }
            "7" -> {
                println("Seleccionado: Aceite")
                listaIngredientes += "Aceite \n"
            }
            "8" -> println("Receta guardada.")
            else -> println("Esa opción es incorrecta.")
        }
    } while (response.equals("8").not())
    receta = "Receta: $respuesta \nIngredientes: \n$listaIngredientes \n **************************\n"
    return receta
}