import CustomPostgresDriver.api._
import slick.lifted.ProvenShape
import shapeless.{ HList, ::, HNil, Generic }
import slickless._

case class BigCaseClass(
                       one: String,
                       two: String,
                       three: String,
                       four: String,
                       five: String,
                       six: String,
                       seven: String,
                       eight: String,
                       nine: String,
                       ten: String,
                       eleven: String,
                       twelve: String,
                       thirteen: String,
                       fourteen: String,
                       fifteen: String,
                       sixteen: String,
                       seventeen: String,
                       eighteen: String,
                       nineteen: String,
                       twenty: String,
                       twentyOne: String,
                       twentyTwo: String,
                       twentyThree: String,
                       twentyFour: String,
                       twentyFive: String,
                       twentySix: String,
                       twentySeven: String,
                       twentyEight: String,
                       twentyNine: String,
                       thirty: String,
                       thirtyOne: String,
                       thirtyTwo: String,
                       thirtyThree: String,
                       thirtyFour: String,
                       thirtyFive: String,
                       thirtySix: String,
                       thirtySeven: String,
                       thirtyEight: String,
                       thirtyNine: String,
                       forty: Int // This is deliberately changed to be incorrect
                       )

class BigCaseClassTable(tag: Tag) extends Table[BigCaseClass](tag, "big_case_class") {
  def one: Rep[String] = column[String]("one", O.SqlType("text"))
  def two: Rep[String] = column[String]("two", O.SqlType("text"))
  def three: Rep[String] = column[String]("three", O.SqlType("text"))
  def four: Rep[String] = column[String]("four", O.SqlType("text"))
  def five: Rep[String] = column[String]("five", O.SqlType("text"))
  def six: Rep[String] = column[String]("six", O.SqlType("text"))
  def seven: Rep[String] = column[String]("seven", O.SqlType("text"))
  def eight: Rep[String] = column[String]("eight", O.SqlType("text"))
  def nine: Rep[String] = column[String]("nine", O.SqlType("text"))
  def ten: Rep[String] = column[String]("ten", O.SqlType("text"))
  def eleven: Rep[String] = column[String]("eleven", O.SqlType("text"))
  def twelve: Rep[String] = column[String]("twelve", O.SqlType("text"))
  def thirteen: Rep[String] = column[String]("thirteen", O.SqlType("text"))
  def fourteen: Rep[String] = column[String]("fourteen", O.SqlType("text"))
  def fifteen: Rep[String] = column[String]("fifteen", O.SqlType("text"))
  def sixteen: Rep[String] = column[String]("sixteen", O.SqlType("text"))
  def seventeen: Rep[String] = column[String]("seventeen", O.SqlType("text"))
  def eighteen: Rep[String] = column[String]("eighteen", O.SqlType("text"))
  def nineteen: Rep[String] = column[String]("nineteen", O.SqlType("text"))
  def twenty: Rep[String] = column[String]("twenty", O.SqlType("text"))
  def twentyOne: Rep[String] = column[String]("twentyOne", O.SqlType("text"))
  def twentyTwo: Rep[String] = column[String]("twentyTwo", O.SqlType("text"))
  def twentyThree: Rep[String] = column[String]("twentyThree", O.SqlType("text"))
  def twentyFour: Rep[String] = column[String]("twentyFour", O.SqlType("text"))
  def twentyFive: Rep[String] = column[String]("twentyFive", O.SqlType("text"))
  def twentySix: Rep[String] = column[String]("twentySix", O.SqlType("text"))
  def twentySeven: Rep[String] = column[String]("twentySeven", O.SqlType("text"))
  def twentyEight: Rep[String] = column[String]("twentyEight", O.SqlType("text"))
  def twentyNine: Rep[String] = column[String]("twentyNine", O.SqlType("text"))
  def thirty: Rep[String] = column[String]("thirty", O.SqlType("text"))
  def thirtyOne: Rep[String] = column[String]("thirtyOne", O.SqlType("text"))
  def thirtyTwo: Rep[String] = column[String]("thirtyTwo", O.SqlType("text"))
  def thirtyThree: Rep[String] = column[String]("thirtyThree", O.SqlType("text"))
  def thirtyFour: Rep[String] = column[String]("thirtyFour", O.SqlType("text"))
  def thirtyFive: Rep[String] = column[String]("thirtyFive", O.SqlType("text"))
  def thirtySix: Rep[String] = column[String]("thirtySix", O.SqlType("text"))
  def thirtySeven: Rep[String] = column[String]("thirtySeven", O.SqlType("text"))
  def thirtyEight: Rep[String] = column[String]("thirtyEight", O.SqlType("text"))
  def thirtyNine: Rep[String] = column[String]("thirtyNine", O.SqlType("text"))
  def forty: Rep[String] = column[String]("forty", O.SqlType("text"))

  override def * : ProvenShape[BigCaseClass] = {
    val bigClassClassGen = Generic[BigCaseClass]

    (
      one ::
      two ::
      three ::
      four ::
      five ::
      six ::
      seven ::
      eight ::
      nine ::
      ten ::
      eleven ::
      twelve ::
      thirteen ::
      fourteen ::
      fifteen ::
      sixteen ::
      seventeen ::
      eighteen ::
      nineteen ::
      twenty ::
      twentyOne ::
      twentyTwo ::
      twentyThree ::
      twentyFour ::
      twentyFive ::
      twentySix ::
      twentySeven ::
      twentyEight ::
      twentyNine ::
      thirty ::
      thirtyOne ::
      thirtyTwo ::
      thirtyThree ::
      thirtyFour ::
      thirtyFive ::
      thirtySix ::
      thirtySeven ::
      thirtyEight ::
      thirtyNine ::
      forty ::
      HNil
    ) <> (
      (dbRow: bigClassClassGen.Repr) => bigClassClassGen.from(dbRow),
      (caseClass: BigCaseClass) => Some(bigClassClassGen.to(caseClass))
      )

  }

}