segment .data

    ; EBX
    RETURN_EXIT equ 0x0
    STD_INPUT equ 0x0
    STD_OUTPUT equ 0x1

    ; EAX
    SYS_EXIT equ 0x1
    SYS_WRITE equ 0x4

    ; DECLARA MENSAGEM
    message: db 'Hello world!!!'
    size: equ $- message
    
section .text

global _start

    _start:

        mov EAX, SYS_WRITE  
        mov EBX, STD_OUTPUT
        mov ECX, message
        mov EDX, size
        int 0x80

        mov EAX, SYS_EXIT
        mov EBX, RETURN_EXIT
        int 0x80