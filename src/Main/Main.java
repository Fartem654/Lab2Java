package Main;
import UserPanel.UserPanel;
import static CheckInput.CheckInput.inputIntRange;

public class Main {

	static void main(String[] args) {
		UserPanel panel = new UserPanel();
		boolean panelCycle = true;
		int cycle;
		while (panelCycle) {
			panel.choiceTask();
			cycle = inputIntRange("Начать заново?\nДа- 1\nНет-0\n->", -1, 2);
			if (cycle == 1) {
				//Цикл продолжится
			} else {
				panelCycle = false;
			}
		}
	}
}