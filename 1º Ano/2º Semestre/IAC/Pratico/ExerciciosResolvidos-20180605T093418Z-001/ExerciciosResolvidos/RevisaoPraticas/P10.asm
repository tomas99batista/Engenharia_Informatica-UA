	.data
	
frase1:	.space 20
frase2:	.space 20
frase3:	.space 40
insert1:	.asciiz "Insira a frase 1: "
insert2:	.asciiz "Insira a frase 2: "
len:	.asciiz "O número de carateres da frase 1 é: "	
concatenada:	.asciiz "\nA frase concatendada é: "
x:	.asciiz "x"	
		
	.text
	.globl main
	
main:	
	la $a0, insert1
	li $v0,4
	syscall

	la $a0,frase1
	la $a1,20
	li $v0, 8
	syscall
	move $t0,$a0
	
	la $a0, insert2
	li $v0,4
	syscall
	
	la $a0,frase2
	la $a1,20
	li $v0, 8
	syscall
	move $t1,$a0
	

	subu $sp,$sp, 80
	sw $t0, 0($sp)
	sw $t1, 20($sp)
	la $t3, frase3
	sw $t3,40($sp)
	
	
	la $a0, len
	li $v0,4
	syscall
	
	lw $a0, 0($sp)
	jal strlen
	
	move $a0, $v0
	li $v0,1
	syscall
	
	
	la $a0, concatenada
	li $v0,4
	syscall
	
	lw $a1,0($sp)
	lw $a0, 40($sp)
	jal strcopy
	
	move $a0, $v0
	li $v0,4
	syscall
	
	
	li $v0, 10
	syscall

	
		
				
strlen:	li $t0, -1
	lb $t1,	0($a0)

while:	beq $t1, '\0', estrlen
	
	addi $t0, $t0, 1
	addi $a0, $a0,1
	lb $t1,	0($a0)	
	j while

estrlen:
	move $v0,$t0
	jr $ra



strcopy:
	subu $sp, $sp,40
	sw $a0, 0($sp)
	lb $t1, 0($a0)
	lb $t2, 0($a1)

for:	#beq $t1, '\0', efor
	beq $t2, '\0', efor
	sb  $t2, 0($a0)
	
	addi $a0,$a0,1
	addi $a1,$a1,1
	#lb $t1,0($a0)
	lb $t2,0($a1)	
	j for
	
efor:	lw $v0, 0($sp)
	addu $sp, $sp,40
	jr  $ra
			
	

	
	
	
	
	
