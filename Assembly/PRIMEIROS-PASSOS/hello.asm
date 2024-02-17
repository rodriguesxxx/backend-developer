segment .data

	LF equ 0xA ; Quebra de linha
	SYS_CALL equ 0x80 


	; EBX:
	RET_EXIT equ 0x0 ; retorno da saida
	STD_IN   equ 0x0 ; entrada padrao
	STD_OUT	 equ 0x1 ; saida padrao


	; EAX:
	SYS_EXIT equ 0x1 ; Codigo para finalizar programa
	SYS_WRITE equ 0x4 ; escrita no console
	SYS_READ equ 0x3 ; leitura do console


section .data
	msg: db 'Developed By Daniel Rodrigues', LF
	tamMsg equ $- msg

section .text

global _start

	_start:

		; mostrando msg na tela
		mov EAX, SYS_WRITE
		mov EBX, STD_OUT
		mov ECX, msg
		mov EDX, tamMsg
		int 0x80

		; finalizando programa
		mov EAX, SYS_EXIT
		mov EBX, RET_EXIT
		int 0x80
