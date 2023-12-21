#include <iostream>
#include <string>
#include <vector>
using namespace std;

const int LANG_SIZE = 10;
string languages[LANG_SIZE] = {
    "Assembly",
    "Pascal",
    "Cobol",
    "C",
    "C++",
    "C#",
    "Java",
    "PHP",
    "Ruby",
    "Python"
};

vector<string> players;

void showMenu() {
    cout << "1 - JOGAR" << endl;
    cout << "2 - CADASTRAR JOGADORES" << endl;
    cout << "3 - RANKING" << endl;
    cout << "choice: ";
}
void addPlayer() {
    string name;
    cout << "nome: ";
    cin >> name;
    players.push_back(name);
}

void startGame() {
    int choice;
    cout << endl << endl << "###### JOGO DAS LINGUAGENS ######" << endl;
    cout << "###### BY rodriguesxxx ######" << endl << endl;
    showMenu();
    cin >> choice;
    switch(choice) {
        case 1:
            break;
        case 2:
            addPlayer();
            break;
        case 3:
            break;
    }
}

int main() {
    startGame();
    return 0;
}