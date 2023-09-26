import kotlin.test.Test
import kotlin.test.assertEquals
import kotlininvscode.Sample

internal class SampleTest {
  private val testSample: Sample = Sample()

  @Test
  fun testsomthing() {
    val expected = 42
    assertEquals(expected, testSample.sum(40,2))
  }
}
