	.data
	
insert:	.asciiz "Insere um número: "	
fatorial: .asciiz "O fatorial do número inserido é: "	
	.globl main
	.text

main: 
	la $a0, insert
	li $v0, 4
	syscall
	
	li $v0, 5
	syscall
	
	move $t0,$v0
	subi $t1, $t0, 1
	
while:	beqz $t1, out
	
	mul $t0,$t0, $t1
	subi $t1,$t1, 1
	j while
	
out:	

	la $a0, fatorial
	li $v0, 4
	syscall

	move $a0, $t0
	li $v0, 1
	syscall	
	
	 li $v0,10
	 syscall 
	
	