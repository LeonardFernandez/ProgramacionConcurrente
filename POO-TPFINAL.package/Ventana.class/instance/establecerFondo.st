as yet unclassified
establecerFondo
	|background|
	background :=(Form fromFileNamed: 'D:\Descargas\wallpaperbetter.com_1280x768.jpg') asMorph.
	self extent: background  extent .
	self addMorphBack: background .