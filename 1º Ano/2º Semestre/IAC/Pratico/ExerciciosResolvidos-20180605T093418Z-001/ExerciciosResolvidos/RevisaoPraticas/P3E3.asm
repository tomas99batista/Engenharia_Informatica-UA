	.data

pedir:	.asciiz "Introduza 2 números: \n"
pedir1:	.asciiz ">"	

resultado:	.asciiz "A soma é: "	
	
	.text
	.globl main

main:	la $a0, pedir
	li $v0,4
	syscall
	
	la $a0, pedir1
	li $v0,4
	syscall
	
	li $v0,5
	syscall
	move $t0,$v0
	
	la $a0, pedir1
	li $v0,4
	syscall
	
	li $v0,5
	syscall
	move $t1,$v0
	
	add $t0, $t0, $t1
	
	la $a0, resultado
	li $v0,4
	syscall
	
	move $a0, $t0
	li $v0,1
	syscall
	
	
	
	
	

