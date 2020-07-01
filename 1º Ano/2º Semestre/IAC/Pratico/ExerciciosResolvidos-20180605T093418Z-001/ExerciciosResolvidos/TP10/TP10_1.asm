	.data

insert:	.asciiz "Insira uma string: "
str:	.space 25
final:	.asciiz "O tamanho da string inserida é: "
	
	
	.text
	.globl main
	
main:
	la $a0, insert
	li $v0,4
	syscall
	
	la $a0,str
	li $v0,8
	li $a1,25
	syscall
	
	jal contador
	move $t1, $v0
	
	la $a0,final
	li $v0,4
	syscall
	
	move $a0,$t1
	li $v0,1
	syscall
	
	li $v0,10
	syscall
	



contador:	
	addi $t0,$0,-1
	lb $s0,0($a0)
	
	
	while:	beq $s0,'\0',fim
	
		addi $t0,$t0,1
		addi $a0,$a0,1
		
		lb $s0,0($a0)
		
		j while
	
	fim:			
		move $v0,$t0
		jr $ra
	
	
	
	
	
	
