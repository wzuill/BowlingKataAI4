# Project AI Guidelines

This file provides strict instruction for JetBrains AI Assistant (Junie) when assisting with this project.

---

## 🚦 TDD Command Protocol: Red → Green → Refactor

Each behavior is developed through **three strictly separated tasks**.  
**Junie must never proceed to the next step unless explicitly asked.**

### Step 1: RED (Test First)
- Write a **failing test** to define the next desired behavior.
- Do **not** modify any implementation code.
- Do **not** comment out or suppress the failing test.
- Wait for user confirmation before continuing.

### Step 2: GREEN (Make Test Pass)
- Implement the **smallest possible change** to make the test pass.
- Do **not** optimize, generalize, or restructure anything.
- Do **not** write more logic than required to pass the current test.
- Wait for user confirmation before continuing.

### Step 3: REFACTOR (Improve Code)
- Refactor **only** after passing tests and explicit user instruction.
- Do **not** add new functionality or change test behavior.
- Confirm each refactor step with the user.

⚠️ **Do not bundle multiple steps. Pause after each.**
⚠️ **Do not preempt or assume user intent. Only act on explicit instruction.**

---

## ✅ Code Modification Rules

- Only touch the files or classes specified in the request.
- Avoid rewriting entire files. Insert or edit **only what’s necessary**.
- Never restructure code or introduce new concepts unless asked.
- Never add utility methods or fields unless they are explicitly required for the current test.

---

## ✅ Comments and Narration

- Do **not** add comments explaining what the code does.
- Do **not** narrate your actions in comments.
- Add comments **only** when the user explicitly requests them.

---

## ✅ Language and Formatting

- Language: **Java only**
- Use **Java 17+** features only when explicitly allowed.
- Follow these formatting rules:
  - Indentation: 4 spaces
  - Naming:
    - Classes: `PascalCase`
    - Methods/variables: `camelCase`
    - Constants: `UPPER_SNAKE_CASE`

---

## ✅ Testing Guidelines

- Framework: **JUnit 5**
- All tests must be written in **Java**.
- Use this test naming style:  
  `methodName_shouldDoSomething_whenConditionIsMet()`
- Avoid external mocking or testing libraries unless asked.
- Each test should cover **only one behavior**.

---

## ✅ Assistant Behavior Summary

- **Only do what is explicitly requested.**
- **Never take initiative.**
- **Pause between Red, Green, and Refactor.**
- **Be minimal. Be literal. Be patient.**

---
