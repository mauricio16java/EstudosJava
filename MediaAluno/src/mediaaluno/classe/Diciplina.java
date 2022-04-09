package mediaaluno.classe;

import java.util.Objects;

public class Diciplina {
	
	private String diciplina;
	private double nota;
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diciplina other = (Diciplina) obj;
		return Objects.equals(diciplina, other.diciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	@Override
	public String toString() {
		return "Diciplina [diciplina=" + diciplina + ", nota=" + nota + "]";
	}
	


}
