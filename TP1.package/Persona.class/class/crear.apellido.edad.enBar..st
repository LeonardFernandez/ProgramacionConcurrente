Constructores
crear: unNombre apellido: unApellido edad: unaEdad enBar: b

	"Persona(String nombre, String apellido)"

	| persona |
	persona := Persona new.
	persona setNombre: unNombre.
	persona setApellido: unApellido .
	persona setEdad: unaEdad.
	persona setEnBar: b. 
	^ persona