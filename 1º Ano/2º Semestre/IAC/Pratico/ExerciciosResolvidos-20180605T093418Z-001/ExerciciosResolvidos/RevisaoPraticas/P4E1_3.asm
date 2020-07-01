	.data	
	
insert:	.asciiz "Introduza um numero: "
fatorial:	.asciiz "O Fatorial do número inserido é: "
	
	.text
	.globl main
	
main:
	la $a0, insert
	li $v0, 4
	syscall
	
	li $v0,5
	syscall
	
	move $t0, $v0
	subi $t1, $t0, 1
	mul $t2, $t1, $t0
	
for:	beq $t1,1, efor
	subi $t1, $t1, 1
	mul $t2, $t2,$t1	
	j for

efor:	
	move $a0, $t2
	li $v0, 1
	syscall

	li $v0, 10
	syscall

	
	

