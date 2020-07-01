	.data
	
word:	.space 40
insert:	.asciiz "Insira uma string: "
result:	.asciiz "Número de algarismos da string: "

	.text
	.globl main

main:

	la $a0, insert
	li $v0, 4
	syscall
	
	la $a0, word
	la $a1,40s
	li $v0,8
	syscall
	
	move $s1, $a0
	lb $t0 ,0($s1)
	li $t2,0

for: 	
	beq $t0, '\0', efor
	addi $s1, $s1,1
	lb $t0, -1($s1)
	
	bgt $t0, '9', for
	blt $t0, '0', for
	
	addi $t2, $t2,1
	
	j for

efor:	
	la $a0, result
	li $v0,4
	syscall
		
	move $a0, $t2
	li $v0,1
	syscall
	
	li $v0,10
	syscall
			
	
