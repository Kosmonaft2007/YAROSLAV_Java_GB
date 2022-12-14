package final_task.pojo.Specification;

import java.util.Objects;

/*
класс, описание параметров/характеристик дисплея
*/
public class Display{

	private String screenDiagonal;
	private String screenResolution;
	private String matrixType;

	public Display(String screenDiagonal, String screenResolution, String matrixType) {
		this.screenDiagonal = screenDiagonal;
		this.screenResolution = screenResolution;
		this.matrixType = matrixType;
	}

	public String getScreenDiagonal() {
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

		if (!Objects.equals(screenDiagonal, display.screenDiagonal))
			return false;
		if (!Objects.equals(screenResolution, display.screenResolution))
			return false;
		return Objects.equals(matrixType, display.matrixType);
	}

	@Override
	public int hashCode() {
		int result = screenDiagonal != null ? screenDiagonal.hashCode() : 0;
		result = 31 * result + (screenResolution != null ? screenResolution.hashCode() : 0);
		result = 31 * result + (matrixType != null ? matrixType.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format("\n[Размер дисплея: %s, Разрешение: %s, Тип матрицы: %s]", screenDiagonal, screenResolution, matrixType);
	}
}



