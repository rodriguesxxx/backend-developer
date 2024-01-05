
; ordem hexadecimal: 1 2 3 4 5 6 7 8 9 A B C D E F


section .data
	
	msg: db 'hello world!', 0xA ; isso nao e uma variavel, e apenas um apontamento para a memoria.
	tam equ $- msg ; define o tamanho do apontamento, no caso o numero de caracteres = 12
	msg2: db 'Seja Bem vindo', 0xA ; 0xA é o mesmo que o \n
	tam2 equ $- msg2 
section .text

	global _start

	_start:

		;mostrando msg na tela

		mov EAX, 0x4 ; saida de dados padrao
		mov EBX, 0x1 ;  saida padrao
		mov ECX, msg
		mov EDX, tam
		int 0x80 ; executa o programa
		
		mov EAX, 0x4 ; 
                mov EBX, 0x1 ;
		mov ECX, msg2  
                mov EDX, tam2
		int 0x80 ; executa o programa
		
		mov EAX, 0x1
		mov EBX, 0x0
		int 0x80
