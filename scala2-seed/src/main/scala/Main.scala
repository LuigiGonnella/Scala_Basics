// object Main extends App { //to execute the class
//   println("Hello, World!")
// }

//OR

object Main {
  def main(args: Array[String]): Unit = {
    println("-" * 50)

    // println(args.mkString(
    //   start = "Array(",
    //   sep = ", ",
    //   end = ")"
    // ))


    //types of KEYWORDS

    //val, var, def, lazy, type

    val const = { //! val is IMMUTABLE
      println("I'm going to bind const to 1337") //!the prints show
      
      1337 //last line will be returned (like Rust)
    }

    println(const) //!the prints doesn't show
    println(const) //!the prints doesn't show
  
    println("-" * 50)

    var let = { //! with var we can CHANGE the value (MUTABLE)
      println("I'm going to bind let to 1337")
      
      1337 //last line will be returned (like Rust)
    }

    println(let) //!the prints doesn't show
    println(let) //!the prints doesn't show

    let = {
      println("I'm going to bind 1338 to let")//!the prints show
      
      let + 1 //or let += 1
    }

    println(let) //!the prints doesn't show
    println(let) //!the prints doesn't show

    def function = {
      println("I'm going to bid a function to 1337") //!the prints show
      println("But, I will recalculate it every time") //!!!!!!!

      1337
    }

    println(function) //!the prints show
    println(function) //!the prints show (everytime, differently from var and val)


    
    lazy val mix = {
      println("I'm going to bid mix to 1337") //!the prints doesn't show
      println("But only on demand")//!!!!!!!

      1337
    }

    println(mix) //!the prints show --> only the first time it is called
    println(mix) //!now it shows only the number
    

    class TopLevelDefinitions {
      //!CLASS

      //!OBJECTS

      //!TRAITS

      print("All other keywords (val, var, def, lazy val MUST be written inside a top-level definition)") 

      //!not like this in SCALA3 in which everything can be on TOP-LEVEL
    }

    println("-" * 50)


    val const2: Int = { //if I want sto specify return type
      def method = 1337

      method //methods and functions are 'blurry', not clear disitnction
    }

    println(const2)

    println("hello world".length) //!METHOD in Scala we can leave out the empty brackets ()
    println(args.length) //!FIELD

    println("-" * 50)
  }
}



