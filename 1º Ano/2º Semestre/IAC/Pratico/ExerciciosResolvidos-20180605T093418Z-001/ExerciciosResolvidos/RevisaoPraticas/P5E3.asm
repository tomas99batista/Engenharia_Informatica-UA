	.data
	
string: .asciiz "textoemminusculas"
array: .space 17	
x: 	.asciiz "x"
	.text
	.globl main
	
main:
	li $t0, 0
	la $s0, string
	la $s1, array
	
for: 
	beq $t0, 17, efor
	add $t1, $s0,$t0
	add $t2, $s1,$t0
	lb $a0, 0($t1)
	addi $a0, $a0, -32
	sb $a0, 0($t2)
	addi $t0, $t0,1
	j for
			
		
efor:	li $t0,0
efor2:
	beq $t0, 17, fim
	
	add $t1, $s1,$t0
	
	lb $a0, 0($t1)
	li $v0, 11
	syscall
	
	addi $t0, $t0,1
	
	j efor2
	
fim:	li $v0,10
	syscall	

	
	
