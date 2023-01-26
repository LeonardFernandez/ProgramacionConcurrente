initialization
initialize 
	"comment stating purpose of instance-side method"
	super initialize .
	self establecerFondo .
	self color: Color darkGray. 
	self position: 45@45.
	self bounds: (self position extent: 1280@768).
	"Botones"
	botCerrar := BotonAccion crearConNombre: 'X' dimension: 50@50 color: Color black.
	self addMorph: botCerrar .
	
	botCerrar position: self position+(1230@0).
	
	botCerrar mouseAction: [self cerrar].
	self openCenteredInWorld .