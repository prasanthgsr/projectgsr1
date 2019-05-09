import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GameService {
  private amount: number;
  private selectedGame: string;
  private status: string;
//dependency injection
  constructor(private httpClient: HttpClient) {
    this.amount = 600;
   }

  getGamesList() {
        //below port is the port we do all data operations

    return this.httpClient.get('http://localhost:3000/GameList');
  }
   //setting
  setAmount(amount) {
    this.amount = amount;
  }
  //retrieving data
  getAmount() {
    return this.amount;
  }
  getSelectedGame() {
    return this.selectedGame;
  }
  setSelectedGame(selectedGame) {
    this.selectedGame = selectedGame;
  }
  setStatus(status) {
    this.status = status;
  }
  getStatus() {
    return this.status;
  }
}
