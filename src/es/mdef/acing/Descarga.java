package es.mdef.acing;

public class Descarga {
		private Contenido contenido;
		private Float tamañoMegas;
		private int calidad;
		
		
		
		//Constructores:
		public Descarga() {
			super();
		}
		
		public Descarga(Contenido contenido, Float tamañoMegas, int calidad) {
			this.contenido = contenido;
			this.tamañoMegas = tamañoMegas;
			this.calidad = calidad;
		}
}
