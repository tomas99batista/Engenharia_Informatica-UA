	.data

str1:	.space 20
str2:	.space 20
strc:	.space 40

pedir1:	.asciiz "Insira a frase 1: "
pedir2:	.asciiz "Insira a frase 2: "
caract:	.asciiz "Nr de caracteres da frase 1: "
concatenar:	.asciiz "\nFrases concatenadas: "

	
	.text
	.globl main
	
main:
	la $a0, pedir1 ######################  Pedir Strings
	li $v0,4
	syscall
	la $a0, str1
	li $a1,20
	li $v0,8
	syscall
	move $s0,$a0
	la $a0, pedir2  
	li $v0,4
	syscall
	la $a0, str2
	li $a1,20
	li $v0,8
	syscall
	move $s1,$a0 ###################### Fim de Pedir Strings
	
	addi $sp,$sp,-8 #Guardar as Strings na stack
	sw $s0,0($sp)
	sw $s1, 4($sp)
	
	lw $a0, 0($sp) # vai buscar a palavra ao stack
	jal strlen
	move $s0, $v0
	
	la $a0, caract
	li $v0,4
	syscall
	
	add $a0,$s0,$0
	li $v0,1
	syscall
	
	lw $a0,0($sp)
	lw $a1, 4($sp)
	la $a2, strc
	
	addi $sp, $sp,8
	
	jal strconcatenar
	move $s1,$v0
	
	la $a0, concatenar
	li $v0,4
	syscall
	
	move $a0,$s1
	li $v0,4
	syscall
	
	li $v0,10
	syscall


strconcatenar:	
	lb $t0,0($a0)
	lb $t1,0($a1)
	lb $t2,0($a2)

	whilestr1:
		beq $t0,'\n', whilestr2
		beq $t0,'\0', whilestr2
		
		sb $t0, 0($a2)
		addi $a0,$a0,1
		lb $t0,0($a0)
		addi $a2,$a2,1

		addi $t2,$t2,1
		
		j whilestr1
		
	whilestr2:	
		beq $t1,'\n',fim
		beq $t1,'\0',fim
				
		sb $t1, 0($a2)
		addi $a1,$a1,1
		lb $t1,0($a1)
		addi $a2,$a2,1
		
		addi $t2,$t2,1
		
		j whilestr2
		
	
	fim:	sub $a2,$a2,$t2
		
		la $v0,0($a2)
		jr $ra

											
strlen:		
	addi $t0,$0,-1
	lb $s0,0($a0)
	
	while1:	beq $s0,'\0',while1End
		
		addi $t0,$t0,1
		addi $a0,$a0,1
		lb $s0,0($a0)
		j while1

	while1End:
		addi $v0,$t0,0
		jr $ra
	
	
	
	
	
	
	
	
