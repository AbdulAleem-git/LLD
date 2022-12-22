package java;

// Class should depend on interfaces rather than concrete class

// what i mean with that is an has a relationship should always have a interface
// instance let me show 

// lets see the problem first

class MacBook {
     final WiredKeyboard keyboard;
     final WiredMouse mouse;

    MacBook(WiredKeyboard keyboard, WiredMouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

// Solution :- use interfaces rather than abstract class;

class MacBook_solution {
    final Keyboard keyboard;
    final Mouse mouse;

   MacBook(Keyboard keyboard, Mouse mouse){
       this.keyboard = keyboard;
       this.mouse = mouse;
   }
}