	.data
	
array:	.word 4, 3, -2, 1, 27, 45
str:	.asciiz "O conteúdo do array é: \n"
espaco:	.asciiz " | "

	.text
	.globl main

main:	#VAMOS USAR PONTEIROS
	la $a2, array
	addi $t1,$0,0
	lb $t0, 0($a2)
	
	la $a0, str
	li $v0, 4
	syscall
	
	
	la $a0, espaco
	li $v0, 4
	syscall
	
	
while:	beq $t1, 6 , end
	
	move $a0, $t0
	li $v0, 1
	syscall
	
	la $a0, espaco
	li $v0, 4
	syscall
	
	addi $a2,$a2,4
	lb $t0, 0($a2)
	
	addi $t1,$t1,1 #contador
	j while
	
end:	li $v0, 10
	syscall