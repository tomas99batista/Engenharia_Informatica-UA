	.data
	
insert:	.asciiz "Insira um número: "
count:	.asciiz "-"
		
	.text
	.globl main
	
main:
	la $a0,insert
	li $v0, 4
	syscall
	
	li $v0,5
	syscall
	
	move $t0,$v0
	
for:	beqz $t0, end
	subi $t0, $t0,1

	la $a0,count
	li $v0, 4
	syscall

	j for


end:	li $v0, 12
	syscall
	
	
