	.data
	
insert:	.asciiz "Introduz um número: "
linha:	.asciiz "-"
end:	.asciiz "\nI'm Out. Bitch!"

	.globl main
	.text

main:	
	la $a0, insert
	li $v0, 4
	syscall
	
	li $v0, 5
	syscall
	
	move $t0,$v0
	
while:	beqz $t0, fim
	
	la $a0,linha
	li $v0, 4
	syscall
	
	subi $t0, $t0, 1
	
	j while

fim:	la $a0, end
	li $v0, 4
	syscall
	
	li $v0, 10
	syscall
	