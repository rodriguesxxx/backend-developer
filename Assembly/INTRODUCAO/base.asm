; ordem hexadecimal: 1 2 3 4 5 6 7 8 9 A B C D E F


section .data
	
section .text

	global _start

	_start:

		; destino, origem  ; o mesmo que eax = 1
		mov EAX, 0x1 ; significa: SO estou terminando o programa  

		mov EBX, 0x0  ; significa: SO o valor de retorno sera 0

		int 0x80 ; executa o programa
