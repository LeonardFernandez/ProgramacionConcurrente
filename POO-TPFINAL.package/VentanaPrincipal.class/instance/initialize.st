initialization
initialize 
	super initialize .
	botRegistrarUsuario := BotonAccion crearConNombre: 'Registrar Usuario' dimension: 200@50 color: Color black . 
	botSolicitarPrestamo := BotonAccion crearConNombre: 'Solicitar Prestamo' dimension: 200@50 color: Color black.
	botDevolverPrestamo  := BotonAccion crearConNombre: 'Devolver Prestamo' dimension: 200@50 color: Color black.
	botCambiarMembresia  := BotonAccion crearConNombre: 'Cambiar Membresia' dimension: 200@50 color: Color black.
	botInfoUsuario  := BotonAccion crearConNombre: 'Informacion Usuarios' dimension: 200@50 color: Color black.
	botInfoBiblioteca  := BotonAccion crearConNombre: 'Informacion Bibliotecas' dimension: 200@50 color: Color black.
	botAgregarBiblio  := BotonAccion crearConNombre: 'Agregar Biblioteca' dimension: 200@50 color: Color black.
	self addMorph: botRegistrarUsuario .
	self addMorph: botSolicitarPrestamo .
	self addMorph: botDevolverPrestamo .
	self addMorph: botCambiarMembresia .
	self addMorph: botInfoUsuario .
	self addMorph: botInfoBiblioteca .
	self addMorph: botAgregarBiblio .
	botRegistrarUsuario position: 100@200.
	botSolicitarPrestamo position: 100@275.
	botDevolverPrestamo position: 100@350.
	botCambiarMembresia  position: 100@425.
	botInfoUsuario  position: 100@500.
	botInfoBiblioteca  position: 100@575.
	botAgregarBiblio  position: 100@650.
	botRegistrarUsuario mouseAction: [ ventanaRegistroUsuario := VentanaRegistroUsuario new ].