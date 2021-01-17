package example

import java.io.File
import java.util.HashMap
import org.graalvm.polyglot.{Context, Source}

object Hello extends App {

  val projRoot = "./mypurs"
  val spagoDir = projRoot ++ "/.spago"

  val options = new HashMap[String, String]
  options.put("js.commonjs-require", "true")
  options.put("js.commonjs-require-cwd", spagoDir)

  val source = 
    Source.newBuilder("js", new File(spagoDir, "run.js")).build()

  val ctx = 
    Context.newBuilder("js")
      .allowExperimentalOptions(true)
      .allowIO(true)
      .options(options)
      .build()

  println("evaluate: .spago/run.js")
  ctx.eval(source)

  println("evaluate: require('../output/Main').main()")
  ctx.eval("js", "require('../output/Main').main()")
}
