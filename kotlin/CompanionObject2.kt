
      fun main(){
            val myBook = Book(Book.Editor())
            println(myBook.editor.editorName)

      }
      class Book(val editor: Editor){
            companion object{
                  fun Editor()=Editor("O'reilly")
            }

      }
      class Editor(val editorName:String){

      }