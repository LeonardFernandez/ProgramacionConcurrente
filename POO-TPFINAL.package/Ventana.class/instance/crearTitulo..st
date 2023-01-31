as yet unclassified
crearTitulo: elTitulo
	|titulo|
	titulo := StringMorph new.
	titulo contents: elTitulo  ;font: (LogicalFont familyName: StandardFonts defaultFont familyName pointSize: 30).
	self addMorph: titulo .
	titulo position: 650@175 .
	self addMorph: titulo.