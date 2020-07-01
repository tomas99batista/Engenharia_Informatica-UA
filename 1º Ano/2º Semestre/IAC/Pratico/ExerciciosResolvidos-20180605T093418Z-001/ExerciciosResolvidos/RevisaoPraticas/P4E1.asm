	.data

insert:	.asciiz "Insira um número: "
par:	.asciiz "O numero é par!"
impar:	.asciiz "O número é ímpar!"
	
	.text
	.globl main
	
main: 
	la $a0, insert
	li $v0,4
	syscall
	
	li $v0,5
	syscall
	
	rem $t0, $v0,2
	
	beqz $t0, p
	
	la $a0, impar
	li $v0, 4
	syscall
	
	j end

p:	la $a0, par
	li $v0, 4
	syscall

end:	li $v0, 12
	syscall
	
	
	