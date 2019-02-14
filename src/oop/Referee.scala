package oop

object Referee {
   def playGame(t1: Team, t2: Team) {
     t1.score = t1.offense - t2.defense
     if (t1.offense < t2.defense)
       t1.score = 0

     t2.score = t2.offense - t1.defense
     if (t1.offense < t2.defense)
       t1.score = 0

   }
  def declareWinner(t1: Team, t2: Team): Team ={
    if (t1.score > t2.score){
      t1
    }
    else if (t1.score < t2.score){
      t2
    }
    else{
      val t3: Team = new Team (offense = 0, defense = 0)
      t3
    }
  }
}
