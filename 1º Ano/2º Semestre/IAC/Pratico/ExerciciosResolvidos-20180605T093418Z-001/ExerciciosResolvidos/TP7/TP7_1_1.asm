	.data

insert:	.asciiz"Insira um número: "
par : 	.asciiz "O número é par!\n"
impar:	.asciiz "O número é ímpar\n"
end:	.asciiz"FIM!"
	
	.globl main
	.text

main:
	la $a0, insert
	li $v0, 4
	syscall
	
	li $v0,5
	syscall
	move	$t0, $v0  #t1 fica com o valor do input
	li 	$t1, 2
	
	div $t0,$t1
	mfhi $t3
	
	addi $t0,$0,1
	
	bne $t3, $t0, p
		la $a0,impar
		li $v0, 4
		syscall
		j fim
		
p:	la $a0,par
	li $v0, 4
	syscall

fim:	la $a0, end
	li $v0,4
	syscall
	
	li $v0,10
	syscall
	
	 
