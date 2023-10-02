class myImport(private var mynumber: Number) {

  fun showMynumber() : Number {
    return mynumber
  }

  fun changeMynumber(newNumber : Number) : Boolean {
    if(newNumber != mynumber) {
      mynumber = newNumber
      return true
    } else {
      return false
    }
  }
  fun myNumberOperateOn(inputNumber : Number, operation : String ) : Number! {
    return 1
  }
}