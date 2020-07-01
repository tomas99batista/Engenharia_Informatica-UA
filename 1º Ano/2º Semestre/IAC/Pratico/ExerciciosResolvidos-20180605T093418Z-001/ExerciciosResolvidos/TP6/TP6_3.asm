	.data

introduzir:	.asciiz "Introduza 2 números: \n"
resultado:	.asciiz "O resultado é: "

	.globl main
	.text
	
main:	li $v0, 4
	la $a0, introduzir
	syscall
	
	li $v0,5
	syscall	
	add $t0,$0,$v0
	
	li $v0,5
	syscall	
	add $t1, $0, $v0
	
	li $v0, 4
	la $a0, resultado
	syscall
	
	add $a0, $t0, $t1
	li $v0, 1
	syscall
	
	li $v0, 10
	syscall