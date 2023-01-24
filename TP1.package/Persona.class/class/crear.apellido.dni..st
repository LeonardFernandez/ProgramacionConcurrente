Constructores
crear: unNombre apellido: unApellido dni: unDni

	"Persona(String nombre, String apellido)"

	"scope: class-variables  &  class-instance-variables"

	| persona |
	persona := Persona new.
	persona setNombre: unNombre.
	^ persona