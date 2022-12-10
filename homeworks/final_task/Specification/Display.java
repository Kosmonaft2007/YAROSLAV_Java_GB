package final_task.Specification;

import java.util.Objects;

/*
класс, описание параметров дисплея
*/
public class Display{

	private int screenDiagonal;
	private String screenResolution;
	private String matrixType;

	public Display(int screenDiagonal, String screenResolution, String matrixType) {
		this.screenDiagonal = screenDiagonal;
		this.screenResolution = screenResolution;
		this.matrixType = matrixType;
	}

	public int getScreenDiagonal() {
		return screenDiagonal;
	}

	public String getScreenResolution() {
		return screenResolution;
	}

	public String getMatrixType() {
		return matrixType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Display display = (Display) o;
		return screenDiagonal == display.screenDiagonal && Objects.equals(screenResolution, display.screenResolution) && Objects.equals(matrixType, display.matrixType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(screenDiagonal, screenResolution, matrixType);
	}

	@Override
	public String toString() {
		return String.format("\n[Размер дисплея: %s, Разрешение: %s, Тип матрицы: %s]", screenDiagonal, screenResolution, matrixType);
	}
}



